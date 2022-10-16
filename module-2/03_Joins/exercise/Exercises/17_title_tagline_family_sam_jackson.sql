-- 17. The titles and taglines of movies that are in the "Family" genre that Samuel L. Jackson has acted in.
-- Order the results alphabetically by movie title.
-- (4 rows)

SELECT title, tagline
FROM movie AS m	
	JOIN movie_genre AS mg ON m.movie_id = mg.movie_id
	JOIN genre As g ON g.genre_id = mg.genre_id
	JOIN movie_actor AS ma ON m.movie_id = ma.movie_id
	JOIN person AS p ON p.person_id = ma.actor_id
WHERE genre_name = 'Family' AND person_name = 'Samuel L. Jackson'
ORDER BY title