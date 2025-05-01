.class Lcom/join/mgps/fragment/GameOlFirstFragment_$e;
.super Ljava/lang/Object;
.source "GameOlFirstFragment_.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GameOlFirstFragment_;->onViewChanged(La4/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/GameOlFirstFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GameOlFirstFragment_;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GameOlFirstFragment_$e;->b:Lcom/join/mgps/fragment/GameOlFirstFragment_;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/GameOlFirstFragment_$e;->b:Lcom/join/mgps/fragment/GameOlFirstFragment_;

    invoke-virtual {p1}, Lcom/join/mgps/fragment/GameOlFirstFragment;->setNetwork()V

    return-void
.end method
