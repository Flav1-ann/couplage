package fr.ensup.music.controller;

import fr.ensup.music.domain.Music;
import fr.ensup.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private MusicService musicService;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Music> musicList = musicService.listAll();
        model.addAttribute("musicList",musicList);
        return "index";
    }


}

