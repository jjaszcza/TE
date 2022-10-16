-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie.
-- Order the results by movie title (A-Z)
-- (73 rows)

SELECT DISTINCT title, d.person_name
FROM movie AS m
	JOIN person AS d ON m.director_id = d.person_id
	JOIN movie_actor AS ma ON ma.movie_id = m.movie_id
	JOIN person as a ON ma.actor_id = a.person_id
WHERE d.person_name = a.person_name
ORDER BY title