package cn.hp.action;


import cn.hp.model.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

 import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserAction {

//    2、通过处理方法的形参接受请求参数
    /*
    @RequestMapping(value = "login")
    public String login(String userName,String pwd){

        System.out.println(userName);
        System.out.println(pwd);
        return null;

    }
    */

//    3、通过HttpservletRequest 接受请求参数
    /*
    @RequestMapping(value = "login")
    public String login(HttpServletRequest request){

        System.out.println(request.getParameter("userName"));
        System.out.println(request.getParameter("pwd"));
        return null;

    }

     */

//5、通过@RequestParam接受请求参数
    /*
//    请求参数是 从请求头中获取
    @RequestMapping(value = "login")
    public String login(@RequestParam String userName,@RequestParam String pwd){

        System.out.println(userName);
        System.out.println(pwd);
        return null;

    }

     */


//6、通过@ModelAttribute接受请求参数
    /*
//    @ModelAttribute 除了 接受数据还可以进行存储   传值
//    model 实体类中 的属性 要和前端的 你要传的参数名  name 一样
    @RequestMapping(value = "login")
//    public String login(@ModelAttribute UserInfo userInfo){//没有加（） 也可以取出来  ？？？？？？？？？ 加("userInfo") 不加的话 是只可以接受  不能传  加的话 可以接受  然后在存到 http域里
    public String login(@ModelAttribute("userInfo") UserInfo userInfo){

//        System.out.println(userInfo.getUserName());
//        System.out.println(userInfo.getPwd());
//        它到index2 是转发过去的 路径还是 index
        return "index2";
    }

     */


    //重定向 到 index2 并接收值
    /*
    @RequestMapping(value = "login")
    public String login(@ModelAttribute("userInfo") UserInfo userInfo, HttpSession session){

//        重定向 是重新在发送一个请求 取不到值  要是想取值 就要存到session 会话域里

        session.setAttribute("userInfo",userInfo);
        return "redirect:index2.jsp";
    }

     */
//重定向 到action 里 直接 return   action 名字
    @RequestMapping(value = "login")
    public String login(@ModelAttribute("userInfo") UserInfo userInfo, HttpSession session){

//        重定向 是重新在发送一个请求 取不到值  要是想取值 就要存到session 会话域里

        session.setAttribute("userInfo",userInfo);
        return "redirect:show";
    }

    @RequestMapping(value = "show")
    public String hollo(){
        System.out.println("重定向action");
        return null;
    }




}
