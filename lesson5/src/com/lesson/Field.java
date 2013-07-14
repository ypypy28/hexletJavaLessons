package com.lesson;

public class Field {

    private static final int FIELD_SIZE = 3;

    private static final char DEFAULT_FIELD_VALUE = ' ';

    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    private void eraseLine( int lineNumber ) {
        for ( int i = 0; i < FIELD_SIZE; i++ ) {
            field[i][lineNumber] = DEFAULT_FIELD_VALUE;
        }
    }

    private void showCell( int x, int y ) {
        System.out.print( "[" + field[x][y] + "]" );
    }

    private void showLine( int lineNumber ) {
        for ( int i = 0; i < FIELD_SIZE; i++ ) {
            showCell( i, lineNumber );
        }
    }

    public void eraseField() {
        for ( int i = 0; i < FIELD_SIZE; i++ ) {
            eraseLine(i);
        }
    }

    public void showField() {
        for ( int i = 0; i < FIELD_SIZE; i++ ) {
            showLine(i);
            System.out.println();
        }
        System.out.println();
    }

}
