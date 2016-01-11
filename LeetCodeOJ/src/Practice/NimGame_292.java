package Practice;

/**
 *292. Nim Game
 *  You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.

 Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.

 For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 *
 *Total Accepted: 34160 Total Submissions: 67505 Difficulty: Easy
 *
 * 在这个问题中，我们需要从如何才能获得胜利这个角度谈谈解决方案。
 * 如果在你的回合，还有1-3个石头，那么你可以一次性将它们取走从而获得胜利。
 * 如果在你的回合，还有4个石头，那么无论你拿一个还是两个三个，剩下的1-3个石头都会被对手通过以上的步骤全部取走。
 * 如果在你的回合，还有5-7个石头，那么你可以拿走1-3个使最终的石头变成4个，通过上一步取得胜利。
 * 如果在你的回合，还有8个石头，那么无论你拿走几个，你的对手都可以把数字降到4从而取得胜利。
 *
 * 在以上的分析中我们可以发现，要想取得胜利，必须在对手的回合是他面对一个自己永远无法将它取光的数。
 * 他自己可以直接拿到1-3.
 * 如果此数为4，则对手将不可能取得最后一个数。
 * 如果此数为5，则对手可以选取1来将剩余数变成4.
 * 。。。。。。
 * 综上，必须让对手在进行选择时剩余石头数字为4及其倍数。因为只有4是对手无论如何也无法到达的。
 * 换言之，我们需要做到的，就是让我们回合开始时余数不为4及其倍数。
 *
 * Created by chenluzhou on 2016/1/11.
 */
public class NimGame_292 {
    public boolean NimGame(int TotalNumber){
        boolean flag;                      //使用flag表示返回的数值

        //判断回合开始时面对的数（即该堆石头的总数）是否是4的倍数
        if(TotalNumber % 4 == 0){
            //若是4的倍数则此局会输
            flag = false ;
        }else{
            //若不是4的倍数则获得胜利
            flag = true ;
        }

        return flag ;
    }


}
