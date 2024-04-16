# Write your MySQL query statement below
-- WITH act_record AS (
--     SELECT
--         *,
--         LAG(timestamp) 
--             OVER (
--                 ORDER BY
--                     machine_id,
--                     process_id,
--                     activity_type
--             )
--         AS lag_act
--     FROM Activity
-- )
-- SELECT 
--     *
-- FROM
--     act_record

SELECT
    machine_id,
    ROUND (
            (
                (
                    SUM(CASE WHEN activity_type = 'end' THEN timestamp ELSE 0 END) - 
                    SUM(CASE WHEN activity_type = 'start' THEN timestamp ELSE 0 END)
                ) / COUNT(DISTINCT process_id)
            ), 3
        ) 
   
    as processing_time
FROM Activity
GROUP BY machine_id

