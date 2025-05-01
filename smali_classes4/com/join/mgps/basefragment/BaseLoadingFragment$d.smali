.class Lcom/join/mgps/basefragment/BaseLoadingFragment$d;
.super Ljava/lang/Object;
.source "BaseLoadingFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/basefragment/BaseLoadingFragment;->c0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/basefragment/BaseLoadingFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/basefragment/BaseLoadingFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/basefragment/BaseLoadingFragment$d;->b:Lcom/join/mgps/basefragment/BaseLoadingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/basefragment/BaseLoadingFragment$d;->b:Lcom/join/mgps/basefragment/BaseLoadingFragment;

    iget-object v0, v0, Lcom/join/mgps/basefragment/BaseLoadingFragment;->b:Lcom/join/mgps/customview/LoadingLayout;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/customview/LoadingLayout;->g()V

    :cond_0
    return-void
.end method
