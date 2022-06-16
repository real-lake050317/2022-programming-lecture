package Card;

class CardDeckTest { 
      public static void main(String args[]) { 
            Deck d = new Deck();       // 카드 한 벌(Deck)을 만든다. 
			
            /*Card c = d.pick(0);       // 섞기 전에 제일 위의 카드를 뽑는다. 
            System.out.println(c); 
            
			d.shuffle();                   // 카드를 섞는다. 
            c = d.pick(0);             // 섞은 후에 제일 위의 카드를 뽑는다. 
            System.out.println(c); 
			*/
			
			Card p1[]=new Card[5];
			for(int i=0;i<p1.length;i++){
				p1[i]=d.pick(i*5);
			}

			for(int i=0;i<p1.length;i++){
				System.out.print(p1[i]+" ");
			}
			System.out.println();//*/


            /*d.shuffle(); 
			for(int i=0;i<p1.length;i++){
				p1[i]=d.pick(i*5);
			}

			for(int i=0;i<p1.length;i++){
				System.out.print(p1[i].toString()+" ");
			}
			System.out.println();
			//*/
			
			/*Card a=new Card(2,11);
			//System.out.println(a.toString());

			Deck b=new Deck();
			b.printDeck();
			b.shuffle();
			b.printDeck();
			//*/
      } 
} 

// Deck클래스 
class Deck { 
      final int CARD_NUM = 52;       // 카드의 개수 
      Card c[] = new Card[CARD_NUM]; 

      Deck () {       // Deck의 카드를 초기화한다. 
            int i=0; 

            for(int k=Card.KIND_MAX; k > 0; k--) { 
                  for(int n=1; n < Card.NUM_MAX + 1 ; n++) { 
                        c[i++] = new Card(k, n); 
                  } 
            } 
      } 

      Card pick(int index) {       // 지정된 위치(index)에 있는 카드 하나를 선택한다. 
            return c[index%CARD_NUM]; 
      } 

      Card pick() {                   // Deck에서 카드 하나를 선택한다. 
            int index = (int)(Math.random() * CARD_NUM); 
            return pick(index); 
      } 

      void shuffle() {             // 카드의 순서를 섞는다. 
            for(int n=0; n < 1000; n++) { 
                  int i = (int)(Math.random() * CARD_NUM); 
                  Card temp = c[0];       // 첫 번째 카드와 임의로 선택된 카드를 서로 바꾼다. 
                  c[0] = c[i]; 
                  c[i] = temp; 
            } 
      } 

	  void printDeck()
		 {
		  int i=0;
		/*for(int i=1;i<=13;i++){
			for(int j=0;j<4;j++){
				System.out.print(c[i].toString() + " ");
			}
			System.out.println();
		}*/
		for(int k=Card.KIND_MAX; k > 0; k--) { 
                  for(int n=1; n < Card.NUM_MAX + 1 ; n++) { 
                        System.out.print(c[i++].toString() + " ");
                  } 
				  System.out.println();
            } 
	  }
} 

// Card클래스 
class Card { 
      static final int KIND_MAX = 4;             // 카드 무늬의 수 
      static final int NUM_MAX = 13;       // 무늬별 카드 수 

      static final int SPADE = 4; 
      static final int DIAMOND = 3; 
      static final int HEART = 2; 
      static final int CLOVER = 1; 

      int kind; 
      int number; 

      Card() { 
            this(SPADE, 1); 
      } 

      Card(int kind, int number) { 
            this.kind = kind; 
            this.number = number; 
      } 

      public String toString() { 
            String kind=""; 
            String number=""; 

            switch(this.kind) { 
                  case 4 : 
                        //kind = "SPADE"; 
						  kind = "S"; 
                        break; 
                  case 3 : 
                        //kind = "DIAMOND"; 
						 kind = "D";
                        break; 
                  case 2 : 
                       // kind = "HEART"; 
						kind = "H";
                        break; 
	              case 1 : 
                       // kind = "CLOVER"; 
						 kind = "C";
                        break; 
                  default : 
            } 

            switch(this.number) { 
                  case 13 : 
                        number = "K"; 
                        break; 
                  case 12 : 
                        number = "Q"; 
                        break; 
                  case 11 : 
                        number = "J"; 
                        break; 
                  default : 
                        number = this.number + ""; 
            } 
            //return "kind : " + kind + ", number : " + number; 
			return "[ " + kind + " : " + number+" ] ";
      } 
}