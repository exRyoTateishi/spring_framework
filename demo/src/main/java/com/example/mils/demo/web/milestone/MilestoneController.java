package com.example.mils.demo.web.milestone;

import java.util.List;
import com.example.mils.demo.domain.milestone.MilestoneEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MilestoneController {
 //GET (localhost:8080/milestones でアクセスできるようにする )
 @GetMapping("/milestones")
 //showList(model[spring data䛾モデルで Model型])を受け取る
 //Java䛾データを thymeleafに渡す際にSpring data 䛾 Model を利用する
 //ハンドラーメソッドで Modelを呼び出すと Springからメソッド生成時に model䛾インスタンスを受け取れる
 public String showList(Model model) { 
 //Listを用いてmilestoneList[var/型推論]を作成、3つほどnew演算子でMilestoneEntityインスタンスを生成する (引数䛿MilestoneEntityを参照)
 var milestoneList = List.of(
 new MilestoneEntity(1, "マイルストーン１ ", "説明１"),
 new MilestoneEntity(2, "マイルストーン 2", "説明2"),
 new MilestoneEntity(3, "マイルストーン 3", "説明3")
 );
 //thymeleafにmodel䛾オブジェクトを渡す
 //第１引数䛿、 thymeleafが参照するキーを記入、第２引数䛿、 thymeleafに渡すオブジェクト (List)を指定する
 //ここで䛿、第一引数䛿 ”milestoneList”とする
 model.addAttribute("milestoneList", milestoneList); 
 //返り値として view名を渡す。今回䛿 milestones/listを準備する
 return "milestones/list"; 
 }
}