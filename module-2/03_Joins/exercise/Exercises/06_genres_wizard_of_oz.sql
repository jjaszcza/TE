-- 6. The genres of "The Wizard of Oz" sorted in alphabetical order (A-Z).
-- (3 rows)

SELECT genre_name
FROM genre AS g
	JOIN movie_genre AS mg ON g.genre_id = mg.genre_id
	JOIN movie AS m ON m.movie_id = mg.movie_id
WHERE title = 'The Wizard of Oz'
ORDER BY genre_name

