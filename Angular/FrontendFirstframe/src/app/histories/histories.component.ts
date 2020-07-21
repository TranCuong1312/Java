import { Component, OnInit } from '@angular/core';
import { HistoriesService } from '../services/histories.service';
import { Histories } from '../models/histories';

import { Router} from '@angular/router';

@Component({
  selector: 'app-histories',
  templateUrl: './histories.component.html',
  styleUrls: ['./histories.component.css']
})
export class HistoriesComponent implements OnInit {
  histories: Histories[] =[];

  constructor(private historiesService: HistoriesService, private router: Router) { }

  ngOnInit(): void {
    this.GetHistories();
  }

  GetHistories(){
    this.historiesService.GetHistories().subscribe(
      res =>{
        this.histories = res;
      },
      err =>{
        alert("Some problems happen");
      }
    )
  }
}
