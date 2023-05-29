package com.example.mils.demo.web.milestone;

import com.example.mils.demo.domain.milestone.MilestoneService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MilestoneController {
  //MilestoneServiceインスタンスの生成
  private final MilestoneService milestoneService = new MilestoneService();
  //GET (localhost:8080/milestones でアクセスできるようにする )
  @GetMapping("/milestones")
  //showList(model[spring data䛾モデルで Model型])を受け取る
  //Java䛾データを thymeleafに渡す際にSpring data 䛾 Model を利用する
  //ハンドラーメソッドで Modelを呼び出すと Springからメソッド生成時に model䛾インスタンスを受け取れる
  public String showList(Model model) { 
    model.addAttribute("milestoneList", milestoneService.findAll());
    //thymeleafにmodel䛾オブジェクトを渡す
    //第１引数䛿、 thymeleafが参照するキーを記入、第２引数䛿、 thymeleafに渡すオブジェクト (List)を指定する
    //返り値として view名を渡す。今回䛿 milestones/listを準備する
    return "milestones/list"; 
  }
}