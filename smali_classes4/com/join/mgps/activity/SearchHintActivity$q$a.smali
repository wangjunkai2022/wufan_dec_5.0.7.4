.class Lcom/join/mgps/activity/SearchHintActivity$q$a;
.super Ljava/lang/Object;
.source "SearchHintActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchHintActivity$q;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/GameInfoBean;

.field final synthetic c:Lcom/join/mgps/activity/SearchHintActivity$q;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchHintActivity$q;Lcom/join/mgps/dto/GameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$q$a;->c:Lcom/join/mgps/activity/SearchHintActivity$q;

    iput-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$q$a;->b:Lcom/join/mgps/dto/GameInfoBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$q$a;->c:Lcom/join/mgps/activity/SearchHintActivity$q;

    iget-object p1, p1, Lcom/join/mgps/activity/SearchHintActivity$q;->c:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$q$a;->b:Lcom/join/mgps/dto/GameInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameInfoBean;->getGame_name()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/SearchHintActivity$q$a;->b:Lcom/join/mgps/dto/GameInfoBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameInfoBean;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/activity/SearchHintActivity;->C0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
