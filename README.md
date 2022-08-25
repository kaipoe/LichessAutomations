# LichessAutomations
Collection of test automation scripts for Lichess.org

Welcome to LichessAutomations by Kaipo E.

Lichess is a free and open-source Internet chess server run by a non-profit organization of the same name.

These test automations will perform basic functional testing of critical website functionality such as logging in, creating a game, and managing settings.

The 'pages' directory contains all page object models for lichess.org where automation test scripts are run. 
These files should not be altered. 

The 'Tests' directory contains all automation test scripts that are to be run as Java code. 
These files may be altered locally to input credentials or to adjust the test scenario. 

Steps to run code on your machine:

1. Clone this repo to your local system (git clone https://github.com/kaipoe/LichessAutomations.git).
2. Download chromedriver at https://chromedriver.chromium.org/downloads.
3. Configure your chrome driver directory within "System.setProperty" (Path to where your chromedriver.exe is installed). 
4. Set your testing username and credentials within the test case scripts. 
5. Run the test cases as a Java class in your IDE. 