# Changelog

---

## [2.2.1]

### Added
- Chests on the floating islands can now hold maps to 13 other places, from the Arena and the Volcano to the Muddy Water Hole
  - The blank map in the Arena's dungeon chests is now a map to the Volcano

### Fixed
- Enchanted loot in some chests can now roll treasure enchantments such as Mending, as it does on newer versions
- Fixed the mod not loading on NeoForge 1.20.5
- Chests that couldn't be opened because of a block above them now open

### Changed
- Now requires Moog's Structure Lib 4.0.0 or newer

---

## [2.2.0] - 2026-09-20

### Added
- Every structure apart from the trees now has a working Preview button in Moog's Structure Lib's config screen
- A glow item frame now decorates the desert pyramid
- Decorated pots in the desert pyramid, jungle, mangrove, muddy water hole, small tower, taiga and volcano now hold loot that fits where they're found

### Changed
- Villagers, pillagers and the arena's skeleton archers are now rolled fresh every time a structure generates, instead of every copy being identical
- Monster spawners now pick their mob each time a structure generates, and modpacks can change which mobs each structure's spawners use
- A few spawners that never spawned anything, in the arena, muddy water hole and red sand, are now active
- Trees are now spread more evenly instead of sometimes clustering together, and share a single toggle and spacing slider in Moog's Structure Lib's config screen
- The chest at the top of the castle tower has slightly toned-down loot to better match how easy it is to reach
- Barrels that form part of the white house's walls no longer hold loot
- The large tower and white house use leaves instead of green wool in their natural areas
- Now needs Moog's Structure Lib 3.0.0 or newer
- Trees, calcite houses, small ponds, nether portals, leaf hollows, small oak houses, castle ruins, small towers and castle towers generate less often, so the world feels less crowded
- Structures are now spread out the same way as on newer Minecraft versions, instead of generating much closer together

### Fixed
- Villagers in the white house and diorite house now offer proper trades
- The trees at the arena, large tower, white house and diorite house have their full leaves again
- Every structure has been rebuilt for each Minecraft version it supports, fixing a range of small visual and loading problems

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
- Fixed 5 corrupted structure nbt's
- Removed unused files

---

## [2.0.2] - 2026-01-28

### Changed
- Overhauled the arena
  ![Imgur](https://imgur.com/JcLRvqm.png)
  ![Imgur](https://imgur.com/KuasRLh.png)
  ![Imgur](https://imgur.com/KTfPNw5.png)

### Fixed
- Fixed structure lib dependency version

---
