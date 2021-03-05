package algorithmlearnning._01stack;

import java.util.Stack;

/**
 * @Description TODO
 * @Date 2021/3/5 11:04 上午
 * @Created by zhoukun
 */
public class _01Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        //返回位置 1开始
        int search = stack.search(1);
        //长度
        int size = stack.size();

        System.out.println("查看："+ stack.peek());
        System.out.println("弹出：" + stack.pop());

        System.out.println("查看：" + stack.peek());
        System.out.println("弹出：" + stack.pop());

        System.out.println("是否空："+ stack.empty());
    }
}
