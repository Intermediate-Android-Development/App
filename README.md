# Packer

## Table of Contents

1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)

## Overview

### Description

Packer is an app for helping you plan for your Trip. It will help you keep track of the weight of items as you pack by logging them and totaling the weight of items for you. Packer can be used to efficiently trim items from your bag until you reach your target weight.

### App Evaluation

- **Mobile**
    - Functionality will include the ability for users to create accounts and plan the items they intend to take for their trip. We will implement the ability to plan for different types of trips such as flight, hiking, roadtrip etc. Flights have max weight limits and hikes have reccommended weight limits based off of the hikers body weight so we could give alerts if the user overpacks. Users would need to input the items they are bringing along with the weight. 
    - We will allow users to download a pdf/csv file of their trip inventory as hikes may be in areas that lack cell service. We will implement a database for data persistence and connect to the camera so that the user can add an image of items if they wish.
- **Story**
    - Have you ever packed for a flight and it turned out you were just overweight for the carry on limit? Or you packed for a hike and as the hike is going on, you are now suffering from back pain due to overpacking? Now you need to go through your bags and find what you can get rid of so that you can meet the weight limits. Our app has an itemized list so this makes the process of cutting weight significantly easier. This is an app that would appeal to friends and peers preparing for trips.
- **Market**
    - The market for this app is very large as it would appeal to anyone taking a trip of any type. This is especially useful for people who have trips often as having the ability to look at what was packed for past trips can help avoid forgetting items for an upcoming trip.
- **Habit**
    - Users would only use this app when they are going on trips which makes it not very useful for everyday use unless you travel frequently.
- **Scope**
    - Packer is very achievable by the end of the semester. Nothing seems unachievable so there should be no reason to make a stripped down version of the app.

## Product Spec

### 1. User Features (Required and Optional)

**Required Features**

- [X] Setup GitHub issues and project board
- [X] Design Database Structure and Implement Database
- [X] Implement Database Using Firebase
- [X] Implement Auth Using Firebase
- [X] Create Login Page 
- [X] Create Sign Up Page 
- [X] Create Bottom Navigation Bar
- [X] Login screen with login credentials stored in a database
- [X] Bottom navigation bar for traversing pages
- [X] Create Trip List Page 
- [X] Create My Items list Page 
- [X] Create Add Trip Page
- [X] Create Add My Item Page
- [X] UI Design Refinement
- [X] Created all the views needed for this project
- [X] The ability to create a trip. You can specify the type of trip, dates of the trip, and weight limits.
- [X] Users can edit the trip.
- [X] Users can delete the trip.
- [X] Users can add items and the weight of each item to the trip and our app will add the total weights.
- [X] Users can upload images of items.
- [X] Users can edit the items.
- [X] Users can delete the items.
- [X] Added an Alerter to login and Signup page.
- [X] Users can able to add item to trips.
- [X] Cleaning up the project.
- [X] Extensive Testing.

**Stretch Features**

- [X] Weather information displayed.
- [ ] The ability to export trips to a csv/pdf
- [ ] The ability to take pictures directly within the app.
- [ ] The ability to make copies of trips
- [ ] Account personalization

### 2. Screen Archetypes

- Login Screen
  - We ask for the user for their username and password.
  - If the correct username and password are provided then we move to the user specific list of trips, otherwise we display a message saying incorrect username/password combination.
- List of Trips Made
  - Here we have a list of trips made and users can select a trip and it will move them to the edit trip page.
  - Users can also logout from this page.
  - Users can also click a button that allows them to create a new trip.
- New Trip Page
  - This will ask users to enter a name for the trip and select the type of trip from a dropdown list. Options will be flight, road trip, hike, and camping trip.
  - Users can optionally enter the dates, location, and weight limit of their trip.
  - There will be a button that says "Create trip" that will only work once the name and type of trip is entered.
- Edit Trip Page
  - Users will be able to add a new item to the trip packing. This includes the name of the item, the quantity and the weight per item.
  - Users can also delete items and change the quantity and weights of items.
  - At the bottom of the page, there will be a button that says "Save" to update the trip in the database along with the current weight in the trip.
  - Users can also add "bags" and add items to specific bags.
- Register Page
  - Users can enter a username and password and click a register button at the bottom of the page to register.
  - If a username is in the database, we will display a message saying username already taken.


### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Registration Tab - Leads to register page
* Login Tab - Leads to the login page 
* List Tab - Leads to the List of trips
* New Trip Tab - Leads to the New Trip Page
* Edit Trip Tab - Leads to the Edit Trip Page

**Flow Navigation** (Screen to Screen)

- Login Page
  - Successful login leads to the list of trips
- Register Page
  - Successful registration leads to the login page
- List Tab, New Trip Page, and Edit Trip
  - Navigation Bar at the bottom can lead to any of the pages in the heading.

## Wireframes

[Add picture of your hand sketched wireframes in this section]
<img src="https://user-images.githubusercontent.com/90267420/226501407-c100518b-4c95-4a6c-9420-faa90f713a99.png" width=600>

### [BONUS] Digital Wireframes & Mockups
<img src="https://user-images.githubusercontent.com/90267420/226501407-c100518b-4c95-4a6c-9420-faa90f713a99.png" width=600>

## Progress

### Unit 8: Build Sprint 1
- [X] Setup GitHub issues and project board
##### NO GIF for this week as we just setup github
### Unit 9: Build Sprint 2
- [X] Design Database Structure and Implement Database
![database structure](https://user-images.githubusercontent.com/90267420/229670821-0500766e-66ea-48ad-adfb-e2371bc7f159.gif)

### Unit 10: Build Sprint 3
- [X] Implement Database Using Firebase
- [X] Implement Auth Using Firebase
- [X] Create Login Page 
- [X] Create Sign Up Page 
- [X] Create Bottom Navigation Bar

![buildsprint3](https://user-images.githubusercontent.com/90267420/231060432-057c26d6-c0b3-4aec-8a15-f1bf4bc6951d.gif)


### Unit 11: Build Sprint 4
- [X] Login screen with login credentials stored in a database
- [X] Bottom navigation bar for traversing pages
- [X] Create Trip List Page 
- [X] Create My Items list Page 
- [X] Create Add Trip Page
- [X] Create Add My Item Page
- [X] UI Design Refinement
- [X] Created all the views needed for this project

![buildsprint4](https://user-images.githubusercontent.com/90267420/232660647-8f712919-fd4a-4f09-94ef-353512f54bf3.gif)


### Unit 12: Build Sprint 5
- [X] The ability to create a trip. You can specify the type of trip, dates of the trip, and weight limits.
- [X] Users can edit the trip.
- [X] Users can delete the trip.
- [X] Users can add items and the weight of each item to the trip and our app will add the total weights.
- [X] Users can upload images of items.
- [X] Users can edit the items.
- [X] Users can delete the items.
- [X] Added an Alerter to login and Signup page.

![buildsprint5](https://user-images.githubusercontent.com/90267420/234169185-6f4f5873-72f2-454f-8d4d-c5ed53062e78.gif)


### Unit 13: Build Sprint 6
- [X] Users can able to add item to trips.
- [X] Cleaning up the project.
- [X] Extensive Testing.
- [X] Weather information displayed.

![buildsprint6](https://user-images.githubusercontent.com/90267420/235565254-ae6cd4f1-1ca4-4e38-9ffe-c9ba3ff6f896.gif)

# Demo Video

[![Alt text](https://img.youtube.com/vi/El53WEj3-sM/0.jpg)](https://www.youtube.com/watch?v=El53WEj3-sM)

Sorry, There is no audio in this demo video.
