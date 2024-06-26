package hw.zako.fakelags.trolling;

public enum TrollingType {
    ALL_CANCEL, // cancelling packets from client
    ENTITIES_NO_MOVE, // freezing all entities for client
    SPAM_SOUNDS, // spam random sounds
    FANTOM_BLOCKS, // spawns barriers next to the player
    RANDOM_TIME, // randomize world time
    SWAP_ITEMS // change item in hand
}