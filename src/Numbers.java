public interface Numbers {
    int ON = 1; // UNIQUE ONE
    int TW = 2; // TWO
    int TH = 3; // THREE
    int FO = 4; // FOUR
    int FI = 5; // FIVE - Length = 4
    int SI = 6; // SIX
    int SE = 7; // SEVEN - Length = 5
    int EI = 8; // EIGHT
    int NI = 9; // NINE
    int EN = 10;// TEN - Length = 3 MEANS Add 10
    int EL = 1; // ELEVEN | UNIQUE Beginning | EL+EN == 1 + 10
    int VE = 10;// TWELVE - Length = 6 | UNIQUE Ending | TW+VE == 2 + 10
    // TH+EN == 3 + 10
    // FO+EN == 4 + 10
    // FI+EN == 5 + 10
    // SI+EN == 6 + 10
    // SE+EN == 7 + 10
    // EI+EN == 8 + 10
    // NI+EN == 9 + 10
    int TY = 10; // TY = Multiply by 10
    // TW*TY == 2 * 10
    // TH*TY == 3 * 10
    // FO*TY == 4 * 10
    // FI*TY == 5 * 10
    // SI*TY == 6 * 10
    // SE*TY == 7 * 10
    // EI*TY == 8 * 10
    // NI*TY == 9 * 10
    int HUNDRED = 100;// HUNDRED = Multiply by 100 or 10^2
    int THOUSAND = 1000;// THOUSAND = Multiply by 1000 or 10^3
    int MILLION = 1000000;// MILLION = Multiply by 1000000 or 10^6
    int BILLION = 1000000000;
}
