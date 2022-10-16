-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985.
-- Order the results by actor from oldest to youngest.
-- (20 rows)

SELECT DISTINCT person_name, birthday
FROM person as p
	JOIN movie_actor AS ma ON ma.actor_id = p.person_id
	JOIN movie AS m ON ma.movie_id = m.movie_id
WHERE release_date > '19850101' AND release_date < '19851231' AND birthday > '19500101' AND birthday < '19600101'
ORDER BY birthday 

