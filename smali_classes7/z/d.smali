.class public final synthetic Lz/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/d;->b:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz/d;->b:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    invoke-static {v0}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->g(Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;)V

    return-void
.end method
