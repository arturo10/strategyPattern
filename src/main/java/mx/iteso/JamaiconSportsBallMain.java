package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball golf=new GolfBall();
        Ball pinPong=new PingPongBall();
        Ball tennis=new TennisBall();
        Ball volleyBall=new VolleyBallBall();
        Ball basket=new BasketBallBall();

        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());

        System.out.println();

        System.out.println(golf.roll());
        System.out.println(golf.performBounce());
        System.out.println(golf.performDeflate());
        System.out.println(golf.performInflate());


        System.out.println();

        System.out.println(pinPong.roll());
        System.out.println(pinPong.performBounce());
        System.out.println(pinPong.performDeflate());
        System.out.println(pinPong.performInflate());

        System.out.println();

        System.out.println(tennis.roll());
        System.out.println(tennis.performBounce());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());

        System.out.println();

        System.out.println(volleyBall.roll());
        System.out.println(volleyBall.performBounce());
        System.out.println(volleyBall.performDeflate());
        System.out.println(volleyBall.performInflate());

        System.out.println();

        System.out.println(basket.roll());
        System.out.println(basket.performBounce());
        System.out.println(basket.performDeflate());
        System.out.println(basket.performInflate());



    }
}
