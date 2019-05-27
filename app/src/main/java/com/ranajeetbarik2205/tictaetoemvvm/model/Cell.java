package com.ranajeetbarik2205.tictaetoemvvm.model;

import com.ranajeetbarik2205.tictaetoemvvm.utils.StringUtility;

public class Cell {

    public Player player;

    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        return player == null || StringUtility.isNullOrEmpty(player.value);
    }
}
