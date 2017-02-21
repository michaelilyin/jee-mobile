package ru.michaelilyin

inline fun <T, R> T.use(block: (T) -> R): R where T : AutoCloseable {
    try {
        return block(this)
    } finally {
        this.close()
    }
}