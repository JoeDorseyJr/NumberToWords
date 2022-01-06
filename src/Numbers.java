public interface Numbers {
    int ONE = 1; // UNIQUE
    int TW = 2;
    int TH = 3;
    int FO = 4;
    int FI = 5;
    int SI = 6;
    int SE = 7;
    int EI = 8;
    int NI = 9;
    int EN = 10;    // EN = Add 10
    int EL = 1;     // UNIQUE Beginning | EL+EN == 1 + 10
    int VE = 10;    // UNIQUE Ending    | TW+VE == 2 + 10
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
    int THOUSAND = 100;// THOUSAND = Multiply by 1000 or 10^3
    int MILLION = 1000000;// MILLION = Multiply by 1000000 or 10^6
}
