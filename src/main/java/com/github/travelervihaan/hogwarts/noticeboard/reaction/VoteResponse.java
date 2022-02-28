package com.github.travelervihaan.hogwarts.noticeboard.reaction;

class VoteResponse implements Response {

    private Vote vote;

    @Override
    public void vote(boolean vote) {
        this.vote = vote ? Vote.UP : Vote.DOWN;
    }

    public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }
}
