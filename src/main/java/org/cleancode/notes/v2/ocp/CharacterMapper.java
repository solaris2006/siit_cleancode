package org.cleancode.notes.v2.ocp;

public class CharacterMapper implements NumberMapper<Character> {
    @Override
    public Character map(Integer integer) {
        char c = ((char) ('0' - '0' + integer));
        return c;
    }
}
