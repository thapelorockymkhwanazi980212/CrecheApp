import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';  // Importing the root component

@NgModule({
  declarations: [
    AppComponent  // Declare the root component here
  ],
  imports: [
    BrowserModule  // This is needed to run Angular in the browser
  ],
  providers: [],  // Services can be added here if needed
  bootstrap: [AppComponent]  // Bootstraps the AppComponent to start the application
})
export class AppModule { }
