package com.bridglabz.oops.ds.LinkedByGen;

import java.util.ArrayList;
import java.util.Scanner;

//public class DeckOfCards {

	public class DeckOfCards {
		public static ArrayList<String> deckCards = new ArrayList<>();

	//Welcome message 
		public void welcome() {
			System.out.println("Welcome to the Deck of Card DashBoard");
		}

		/**
		 * @Purpose :To shuffle Cards and display accordingly in consecutive sequence
		 * @John :suits , ranks, no of cards
		 * @Function :For loop to get cards
		 * @Return :Int string
		 */
		public void deckOfCard() {
			String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
			String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
			int numOfCards = suits.length * ranks.length;
			System.out.println("\nNumber of cards in the deck:" + numOfCards);
			for (int i = 0; i < ranks.length; i++) {
				for (int j = 0; j < suits.length; j++) {
					deckCards.add(ranks[i] + "->" + suits[j]);
				}
			}
			toDisplay(deckCards);
		}

		/**
		 * @Purpose :To dispaly arraylist created
		 * @John :Cards in Deck
		 * @Function :For loop ,SOP
		 * @Return :Card Sequence
		 */
		public static void toDisplay(ArrayList<String> cardsDeck) {
			System.out.println("\nCards in Deck:");
			for (String element : cardsDeck) {
				System.out.println(element);
			}
			System.out.println();
		}

		/**
		 * @Purpose :To get no players
		 * @John :Choice i/p
		 * @Function :condition
		 * @Return :no return
		 */
		public void noOfPlayers() {
			System.out.print("\nEnter number of players minimum 2 , maximum 4 : ");
			Scanner scanner= new Scanner(System.in);
			int player;
			try {
				player = scanner.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int player1=1;
			if (player1 >= 2 && player1 <= 4) {
				System.out.println("\n" + player1 + " players will play the game");
			} else {
				System.out.println("Please enter number of players in the Range");
				this.noOfPlayers();
				scanner.close();
			}
		}

		/**
		 * @Purpose :To get sequence of players
		 * @John :Choice i/p
		 * @Function :condition
		 * @Return :no return
		 */
		public void seqOfPlayer(int player) {
			System.out.println("\nSequence of cards are below : ");
			for (int i = 1; i <= player; i++) {
				System.out.println("\nPlayer " + i + " Getting card.............");
			}
		}

		/**
		 * @Purpose :To shuffle card
		 * @John :Choice i/p
		 * @Function :condition
		 * @Return :no return
		 */
		public static void shuffleCard() {
			System.out.println("shuffling the cards before Distribution");
			ArrayList<String> temp = new ArrayList<String>();
			while (!deckCards.isEmpty()) {
				int sufCard = (int) (Math.random() * deckCards.size());
				temp.add(deckCards.get(sufCard));
				deckCards.remove(sufCard);
			}
			deckCards = temp;
			toDisplay(deckCards);
		}

		/**
		 * @Purpose :To distribute card
		 * @John :Choice i/p
		 * @Function :condition
		 * @Return :no return
		 */

		public static void cardDistribution() {
			int player = 0;
			for (int i = 0; i < player; i++) {
				System.out.print("\nPlayer " + (i + 1) + " got cards:\n");
				for (int j = 0; j < 9; j++) {
					System.out.print("\t" + deckCards.get(i + j * player));
				}
			}
			System.out.println();
		}

	//Main class
		public static void main(String[] args) {
			DeckOfCards deckOfCardsGame = new DeckOfCards();
			deckOfCardsGame.welcome();
			deckOfCardsGame.deckOfCard();
			deckOfCardsGame.noOfPlayers();
			deckOfCardsGame.seqOfPlayer(4);
			deckOfCardsGame.shuffleCard();
			deckOfCardsGame.cardDistribution();

		}
	}

