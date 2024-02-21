package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {
    @Test
    void position() {
        Cell position = Cell.C8;
        Figure bishop= new BishopBlack(position);
        Cell expected = bishop.position();
        assertThat(position).isEqualTo(expected);
    }

    @Test
    void copy() {
        Figure bishop = new BishopBlack(Cell.C8);
        Cell position = Cell.F5;
        Figure newBishop = bishop.copy(position);
        Cell expected = newBishop.position();
        assertThat(position).isEqualTo(expected);
    }

    @Test
    void way() {
        Figure figure = new BishopBlack(Cell.C1);
        Cell[] result = figure.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result).isEqualTo(expected);
    }
}