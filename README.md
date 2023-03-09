# Testvagrantcode

Q: illustration, when 4 different songs were played by a user & Initial capacity is 3: 


Let's assume that the user has played 3 songs - S1, S2 and S3.
The playlist would look like -> S1,S2,S3
When S4 song is played -> S2,S3,S4 
When S2 song is played -> S3,S4,S2 
When S1 song is played -> S4,S2,S1


Ans:
I initiated play list and played list to store the songs

I created play method to play the song
When the song is played in my playedlist get rearrange their position based one the recentplayed 
it has limit of 3
second song moved towards the position 1 
third song moved towards the position 2 
recent played one get added with position 3
