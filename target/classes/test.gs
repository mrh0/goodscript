use abs from "Math"

fn main(a: Int): Int do
    log dub(6, 8)
    log "Hello World"
    log abs(-5)
    log 5.55f
    log 0xff
    log 0xAA
    log 0b1110
    log 1&1

fn dub(a: Int): Int do
    ret a+a

fn dub(a: Int, b: Int): Int do
    ret a+b