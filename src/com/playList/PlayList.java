package com.playList;

import java.util.Arrays;
import java.util.List;

public class PlayList {

	static List<String> playList = Arrays.asList("s1", "s2", "s3", "s4");

	static String[] playedlist = { "s1", "s2", "s3" };

	public static void playSong(String song) {

		for (int i = 0; i < playedlist.length; i++) {

			if (playedlist.length - 1 == i) {

				playedlist[i] = song;
			} else {
				playedlist[i] = playedlist[i + 1];
			}

		}

	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(playedlist));

		playSong("s4");
		System.out.println(Arrays.toString(playedlist));

		playSong("s2");
		System.out.println(Arrays.toString(playedlist));

		playSong("s1");
		System.out.println(Arrays.toString(playedlist));
	}
}
