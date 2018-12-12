package controller;


import model.BankAccount;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

public class SimbaController {
  List<BankAccount> bankAccounts = new ArrayList<>();

  @RequestMapping(path = "/show", method = RequestMethod.GET )
  public String showAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

    model.addAttribute("bankaccount",bankAccount);

    return "index";
  }
}
