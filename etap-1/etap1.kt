
fun main() {

    // Dane ucznia
    val imie = "Jan"
    var klasa = "3A"
    val kierunek = "Technik informatyk"

    // Wyświetlenie danych ucznia
    println("===== DANE UCZNIA =====")
    println("Imię: $imie")
    println("Klasa: $klasa")
    println("Kierunek kształcenia: $kierunek")

    // Funkcja obliczająca łączną liczbę godzin
    fun obliczGodziny(godzinyTygodniowo: Int, liczbaTygodni: Int): Int {
        return godzinyTygodniowo * liczbaTygodni
    }

    // Pierwszy zestaw danych
    val wynik1 = obliczGodziny(30, 4)

    // Drugi zestaw danych
    val wynik2 = obliczGodziny(35, 6)

    // Wyświetlenie wyników
    println()
    println("===== LICZBA GODZIN ZAJĘĆ =====")

    println("Pierwszy zestaw:")
    println("30 godzin tygodniowo przez 4 tygodnie = $wynik1 godzin")

    println()

    println("Drugi zestaw:")
    println("35 godzin tygodniowo przez 6 tygodni = $wynik2 godzin")

    println()
    println("Program zakończył działanie.")
}

