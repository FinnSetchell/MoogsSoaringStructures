# Changelog

---

## [2.2.0] - 2026-09-17

### Added
- Every structure apart from the trees now has a working Preview button in Moog's Structure Lib's config screen
- Now supports Minecraft 26.2 and 26.3
- Structures can now generate in the new dappled forest biome
- A glow item frame now decorates the desert pyramid
- Decorated pots in the desert pyramid, jungle, mangrove, muddy water hole, small tower, taiga and volcano now hold loot that fits where they're found

### Changed
- Villagers, pillagers and the arena's skeleton archers are now rolled fresh every time a structure generates, instead of every copy being identical
- Monster spawners now pick their mob each time a structure generates, and modpacks can change which mobs each structure's spawners use
- A few spawners that never spawned anything, in the arena, muddy water hole and red sand, are now active
- Trees are now spread more evenly instead of sometimes clustering together, and share a single toggle and spacing slider in Moog's Structure Lib's config screen
- The chest at the top of the castle tower has slightly toned-down loot to better match how easy it is to reach

### Fixed
- The arena's vaults now open with trial keys and give rewards, and its trial spawners have their own arena loot
- The mod now loads on Minecraft 26.1.2 and newer
- Villagers in the white house and diorite house now offer proper trades
- The trees at the large tower, white house and diorite house have their full leaves again
- Every structure has been rebuilt for each Minecraft version it supports, fixing a range of small visual and loading problems

---

## [2.1.2] - 2026-05-22

### Fixed
- Versioned structures now have a defined path for Minecraft 26.1–26.1.2, so the game stops logging "no version mapping matched" warnings and no longer falls back to an older structure template.

---

## [2.1.0] - 2026-05-04

### Added
- Hundreds of previously empty chests and barrels across all structures now contain loot
- Added tiered loot for those containers from nearly empty junk to a decent hidden stash

### Changed
- Overhauled all loot tables to have better items, better variety, actually worth looting
- Removed unnecessary terrain checks from islands
- Improved biome tags
- prevented all structures from generating within 250 blocks of world origin

### Fixed
- Fixed several structures breaking on older 1.21.x versions
- Fixed a corrupt muddy water hole structure
- Removed unused files

---

## [2.0.2] - 2026-01-28

### Changed
- Overhauled the arena
  ![Imgur](https://imgur.com/JcLRvqm.png)
  ![Imgur](https://imgur.com/KuasRLh.png)
  ![Imgur](https://imgur.com/KTfPNw5.png)
- Removed chains from all loot tables

### Fixed
- Fixed structure lib dependency version

---
