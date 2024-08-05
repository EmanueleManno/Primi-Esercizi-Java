import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            //Opzioni di scelta:
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Somma di due numeri");
            System.out.println("2. Verifica pari o dispari");
            System.out.println("3. Calcolo del fattoriale");
            System.out.println("4. Trova il massimo di un array");
            System.out.println("5. Stampa i numeri primi fino a n");
            System.out.println("6. Calcola la media di un array");
            System.out.println("7. Conta le vocali in una stringa");
            System.out.println("8. Verifica se un numero è un palindromo");
            System.out.println("9. Ordina un array di numeri");
            System.out.println("10. Trova il minimo di un array");
            System.out.println("11. Esci");

            //Prendi l'input inserito dall'utente:
            int scelta = scanner.nextInt();

            //In base al tipo di scelta fai partire la funzione dedicata:
            switch (scelta) {
                case 1:
                    sommaDueNumeri();
                    break;
                case 2:
                    verificaPariDispari();
                    break;
                case 3:
                    calcolaFattoriale();
                    break;
                case 4:
                    trovaMassimoArray();
                    break;
                case 5:
                    stampaNumeriPrimi();
                    break;
                case 6:
                    calcolaMediaArray();
                    break;
                case 7:
                    contaVocaliStringa();
                    break;
                case 8:
                    verificaPalindromo();
                    break;
                case 9:
                    ordinaArray();
                    break;
                case 10:
                    trovaMinimoArray();
                    break;
                case 11:
                    running = false;
                    System.out.println("Uscita...");
                    break;
                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        }

        scanner.close();
    }

    //Funzione Somma di due numeri:
    public static void sommaDueNumeri() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int numero2 = scanner.nextInt();

        int somma = numero1 + numero2;
        System.out.println("La somma è: " + somma);
    }

    //Funzione di verifica Pari e Dispari:
    public static void verificaPariDispari() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Il numero è pari.");
        } else {
            System.out.println("Il numero è dispari.");
        }
    }

    //Funzione del calcolo del Fattoriale:
    public static void calcolaFattoriale() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero positivo: ");
        int numero = scanner.nextInt();

        long fattoriale = 1;
        for (int i = 1; i <= numero; i++) {
            fattoriale *= i;
        }

        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);
    }

    //Funzione che trova il massimo in un array di dati;
    public static void trovaMassimoArray() {
        int[] numeri = {10, 45, 2, 30, 50, 23, 87};

        int massimo = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
        }

        System.out.println("Il valore massimo nell'array è: " + massimo);
    }

    //Funzione che mi stampa i numeri primi fino al numero inserito:
    public static void stampaNumeriPrimi() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero positivo: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Funzione che mi dice se è un numero primo:
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Funzione che mi calcola la media di un array:
    public static void calcolaMediaArray() {
        int[] numeri = {10, 45, 2, 30, 50, 23, 87};
        int somma = 0;
        for (int num : numeri) {
            somma += num;
        }
        double media = (double) somma / numeri.length;
        System.out.println("La media dell'array è: " + media);
    }

    //Funzione che mi conta le vocali contenute in una stringa:
    public static void contaVocaliStringa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String input = scanner.next();

        int conteggio = 0;
        for (char c : input.toCharArray()) {
            if (isVocale(c)) {
                conteggio++;
            }
        }

        System.out.println("Il numero di vocali nella stringa è: " + conteggio);
    }

    //Le vocali sono queste:
    public static boolean isVocale(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    //Funzione di verifica se un numero è un palindromo:
    public static void verificaPalindromo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        int originale = numero;
        int invertito = 0;

        while (numero != 0) {
            int cifra = numero % 10;
            invertito = invertito * 10 + cifra;
            numero /= 10;
        }

        if (originale == invertito) {
            System.out.println("Il numero è un palindromo.");
        } else {
            System.out.println("Il numero non è un palindromo.");
        }
    }

    //Funzione che mi ordina i numeri contenuti in un array:
    public static void ordinaArray() {
        int[] numeri = {10, 45, 2, 30, 50, 23, 87};

        for (int i = 0; i < numeri.length - 1; i++) {
            for (int j = i + 1; j < numeri.length; j++) {
                if (numeri[i] > numeri[j]) {
                    int temp = numeri[i];
                    numeri[i] = numeri[j];
                    numeri[j] = temp;
                }
            }
        }

        System.out.print("Array ordinato: ");
        for (int num : numeri) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //Funzione che mi trova il minimo in un array:
    public static void trovaMinimoArray() {
        int[] numeri = {10, 45, 2, 30, 50, 23, 87};

        int minimo = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
        }

        System.out.println("Il valore minimo nell'array è: " + minimo);
    }
}

