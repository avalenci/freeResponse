package com.company;

public class Code {
    private String myCode;
    private String backup;
    public String xString = "";

    public Code(String code) {
        myCode = code;
        backup = code;
        while (xString.length() != myCode.length()) {
            xString += "X";
        }
    }
    public String getCode() {
        return myCode;
    }
    public void hide(int p1, int p2) {
        myCode = myCode.replace(myCode.substring(p1, p2), xString);
    }
    public void recover(int p1, int p2) {
        myCode = myCode.replace(myCode.substring(p1, p2), backup.substring(p1, p2));
    }
}
