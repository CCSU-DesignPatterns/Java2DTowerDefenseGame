# Tower Defense Game

By Ryan Sharp and Ricardo Almeida

12/5/2022

CS-417

![image](https://github.com/user-attachments/assets/3e9b6e3f-01e9-42ec-9487-50b4a3450515)

# How To Run The Project

Simply run Main.java inside the main package and let the program handle the rest. No arguments are needed to start the game. Any selections like level selection and difficulty selection are done in-app via the GUI.

# Patterns Used

-   Singleton
    -   GamePanel.java
-   Strategy
    -   GamePanel.java
    -   GameplayState.java
    -   PausedState.java
    -   MainMenuState.java
    -   PlacementState.java
-   Template (Levels)
    -   Level.java
    -   Level1.java
    -   Level2.java
    -   Level3.java
-   Abstract Factory (Levels)
    -   LevelFactory.java
    -   ILevelFactory.java
    -   Level.java
    -   Level1.java
    -   Level2.java
    -   Level3.java
-   Prototype
    -   EnemyWaves.java
    -   IEnemy.java
    -   Enemy.java
    -   UpgradedEnemy.java
    -   UpgradedEnemy20S.java
    -   UpgradedEnemy30H.java
-   Abstract Factory (Enemies)
    -   EnemyWaves.java
    -   IEnemy.java
    -   Enemy.java
    -   UpgradedEnemy.java
    -   UpgradedEnemy20S.java
    -   UpgradedEnemy30H.java
-   Decorator (Enemies)
    -   IEnemy.java
    -   Enemy.java
    -   UpgradedEnemy.java
    -   UpgradedEnemy20S.java
    -   UpgradedEnemy30H.java
-   Composite (Enemy)
    -   EnemyManager.java
    -   IEnemy.java
    -   Enemy.java
    -   UpgradedEnemy.java
-   Template (Towers)
    -   Tower.java
    -   TurretTower.java
    -   CannonTower.java
    -   SniperTower.java
-   Composite (Towers)
    -   TowerManager.java
    -   ITower.java
    -   Tower.java
    -   TurretTower.java
    -   CannonTower.java
    -   SniperTower.java
-   Decorator (Towers)
    -   ITower.java
    -   Tower.java
    -   TowerDecorator.java
    -   DoubleFireRateTowerDecorator.java
-   Enumeration
    -   TowerType.java
-   Nested Class
    -   GameplayUI
    -   MainMenuUI

# Pictures - The Project In Action

![image](https://github.com/user-attachments/assets/2260508a-c6f9-4409-be35-ecf2d3d4bd58)

![image](https://github.com/user-attachments/assets/50815917-344a-4460-a44e-1453d38c959e)

![image](https://github.com/user-attachments/assets/6e71d4d7-3bda-4d81-9d41-dba52f7cc48a)

![image](https://github.com/user-attachments/assets/9adde241-4fae-4e50-a813-8a800d5f6305)

![image](https://github.com/user-attachments/assets/936bf34e-4fa5-422f-90eb-cae2cdf8374b)

![image](https://github.com/user-attachments/assets/b7a5d087-0cea-48bb-ab61-66868a4043ea)

