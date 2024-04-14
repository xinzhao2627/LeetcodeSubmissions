# Write your MySQL query statement below
WITH temp_record AS (
    SELECT
        id,
        temperature AS temp,
        LAG(temperature) OVER (ORDER BY recordDate) AS prev_temp,
        LAG(recordDate) OVER (ORDER BY recordDate) AS prev_date,
        recordDate
    FROM 
        Weather
)
SELECT 
    id
FROM
    temp_record
WHERE temp > prev_temp and prev_date = DATE_ADD(recordDate, INTERVAL -1 DAY)
