import { Component } from '@angular/core';
import { CustomerTS } from '../../types/tstypes/Customerts';

@Component({
  selector: 'app-customerarray',
  // standalone: true,
  // imports: [],
  templateUrl: './customerarray.component.html',
  styleUrls: ['./customerarray.component.css']
})
export class CustomerarrayComponent {
  customers:CustomerTS[]=[
    new CustomerTS('1','sam@gmail.com','sam','sam1','IT','2')
  ];
}
