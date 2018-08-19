package controllers;

import data.TestRepository;
import model.Test;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class TestController extends Controller {

    @Inject
    private TestRepository testRepository;

    public Result index(){
        List<Test> tests= testRepository.listAll();
        return ok(views.html.tests.index.render(tests));
    }

    public Result show(Long id){
        return ok(views.html.tests.show.render(id));
    }

    public Result create(){
        return ok(views.html.tests.create.render());
    }

    public Result save(){
        return ok(views.html.tests.save.render());
    }

    public Result remove(Long id){
        return ok(views.html.tests.remove.render(id));
    }

}
