package at.htl.entity;

import javax.persistence.*;


    @Entity
    @Table(name = "MATCH")
    public class Match{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private long matchId;

        @Column
        private boolean isActive;

        @OneToOne
        private Player player1;

        @OneToOne
        private Player player2;

        @OneToOne
        private TennisCourt tennisCourt;

        @Column
        private int scorePlayer1;

        @Column
        private int scorePlayer2;

        public Match() {
        }

        public Match(Player player1, Player player2, TennisCourt tennisCourt, int scorePlayer1, int scorePlayer2) {
            this.player1 = player1;
            this.player2 = player2;
            this.tennisCourt = tennisCourt;
            this.scorePlayer1 = scorePlayer1;
            this.scorePlayer2 = scorePlayer2;
        }


        public long getMatchId() {
            return matchId;
        }

        public void setMatchId(long matchId) {
            this.matchId = matchId;
        }

        public Player getPlayer1() {
            return player1;
        }

        public void setPlayer1(Player player1) {
            this.player1 = player1;
        }

        public Player getPlayer2() {
            return player2;
        }

        public void setPlayer2(Player player2) {
            this.player2 = player2;
        }

        public TennisCourt getTennisCourt() {
            return tennisCourt;
        }

        public void setTennisCourt(TennisCourt tennisCourt) {
            this.tennisCourt = tennisCourt;
        }

        public int getScorePlayer1() {
            return scorePlayer1;
        }

        public void setScorePlayer1(int scorePlayer1) {
            this.scorePlayer1 = scorePlayer1;
        }

        public int getScorePlayer2() {
            return scorePlayer2;
        }

        public void setScorePlayer2(int scorePlayer2) {
            this.scorePlayer2 = scorePlayer2;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "Match{" +
                    "matchId=" + matchId +
                    ", player1=" + player1 +
                    ", player2=" + player2 +
                    ", tennisCourt=" + tennisCourt +
                    ", scorePlayer1=" + scorePlayer1 +
                    ", scorePlayer2=" + scorePlayer2 +
                    '}';
        }
    }

