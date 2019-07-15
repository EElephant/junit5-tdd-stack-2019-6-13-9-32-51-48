package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameTest {
    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }

    @Test
    public void shouldReturn2WhenCallNumberGiven2(){
        Game game = new Game();
        assertThat(game.number(2), is("2"));
    }

    @Test
    public void shouldReturnFizzWhenCallNumberGiven3(){
        Game game = new Game();
        assertThat(game.number(3), is("Fizz"));
    }

    @Test
    public void shouldReturnBuzzWhenCallNumberGiven5(){
        Game game = new Game();
        assertThat(game.number(5), is("Buzz"));
    }

    @Test
    public void shouldReturnWhizzWhenCallNumberGiven7(){
        Game game = new Game();
        assertThat(game.number(7), is("Whizz"));
    }

    @Test
    public void shouldReturnFizzBuzzWhenCallNumberGiven15(){
        Game game = new Game();
        assertThat(game.number(15), is("FizzBuzz"));
    }

    @Test
    public void shouldReturnFizzWhizzWhenCallNumberGiven21(){
        Game game = new Game();
        assertThat(game.number(21), is("FizzWhizz"));
    }

    @Test
    public void shouldReturnBuzzWhizzWhenCallNumberGiven35(){
        Game game = new Game();
        assertThat(game.number(35), is("BuzzWhizz"));
    }

    @Test
    public void shouldReturnFizzBuzzWhizzWhenCallNumberGiven105(){
        Game game = new Game();
        assertThat(game.number(105), is("FizzBuzzWhizz"));
    }

    @Test
    public void shouldReturnFizzWhenCallNumberGiven13(){
        Game game = new Game();
        assertThat(game.number(13), is("Fizz"));
    }

}
