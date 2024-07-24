import { Component } from '@angular/core';
import { AccountTS } from '../../types/tstypes/Accountts';
//import { Account, AccountTS } from '../../types/Account';

@Component({
  selector: 'app-accountsample',
  standalone: true,
  imports: [],
  templateUrl: './accountsample.component.html',
  styleUrls: ['./accountsample.component.css']
})
export class AccountsampleComponent {

  account:any=new AccountTS("1",500.00,"1");
  
}
