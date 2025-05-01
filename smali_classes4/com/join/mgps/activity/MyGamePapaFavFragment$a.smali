.class Lcom/join/mgps/activity/MyGamePapaFavFragment$a;
.super Ljava/lang/Object;
.source "MyGamePapaFavFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaFavFragment;->Z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MyGamePapaFavFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaFavFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$a;->b:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavFragment$a;->b:Lcom/join/mgps/activity/MyGamePapaFavFragment;

    iget-object v1, v0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->h:Ljava/lang/String;

    iget-object v2, v0, Lcom/join/mgps/activity/MyGamePapaFavFragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/activity/MyGamePapaFavFragment;->t0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
