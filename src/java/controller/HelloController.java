/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import Model.BasicUser;
import Model.BasicUserExt;
import Model.UserMgmtModel;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HelloService;



/**
 *
 * @author DEV
 */

@SuppressWarnings("deprecation")
public class HelloController extends SimpleFormController {
    
    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");
        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");

    }
    
  /*  @Override
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }
*/
    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    /*
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        ModelAndView mv = new ModelAndView(getSuccessView());
        //Do something...
        return mv;
    }
     */

@SuppressWarnings("deprecation")
@Override
protected ModelAndView onSubmit(
            HttpServletRequest request,
            HttpServletResponse response,
            Object command,
            BindException errors) throws Exception {

        Name name = (Name) command;
        
        UserMgmtModel usrMgmtModel = new UserMgmtModel();
        usrMgmtModel.registerUser(name.getValue(), name.getValue());
        List<BasicUser> userList = usrMgmtModel.getUserList();
        String str = BasicUserExt.ConcatUserList( userList );
        ModelAndView mv = new ModelAndView(getSuccessView());
        name.setValue( str );
        mv.addObject("helloMessage", helloService.sayHello(name.getValue()));

        return mv;
}

public void setHelloService(HelloService helloService) {
    this.helloService = helloService;
}
private HelloService helloService;


}