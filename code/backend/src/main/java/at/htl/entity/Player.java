package at.htl.entity;

import javax.persistence.*;

    @Entity
    @Table(name = "PLAYER")
    public class Player {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private long playerId;

        @Column
        private String firstname;

        @Column
        private String lastname;

        @Column
        private int score;

        @Column
        private boolean serve;


        public Player() {
        }

        public Player(String firstname, String lastname, int score, boolean serve) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.score = score;
            this.serve = serve;
        }

        public long getPlayerId() {
            return playerId;
        }

        public void setPlayerId(long playerId) {
            this.playerId = playerId;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public boolean isServe() {
            return serve;
        }

        public void setServe(boolean serve) {
            this.serve = serve;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "Player{" +
                    "playerId=" + playerId +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", score=" + score +
                    ", serve=" + serve +
                    '}';
        }
    }


