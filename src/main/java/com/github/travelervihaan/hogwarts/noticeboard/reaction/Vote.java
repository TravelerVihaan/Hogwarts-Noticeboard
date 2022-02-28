package com.github.travelervihaan.hogwarts.noticeboard.reaction;

enum Vote {
    UP(1),
    DOWN(-1);

    private final int voteValue;

    Vote(int voteValue) {
        this.voteValue = voteValue;
    }

    int getVoteValue() {
        return voteValue;
    }
}
