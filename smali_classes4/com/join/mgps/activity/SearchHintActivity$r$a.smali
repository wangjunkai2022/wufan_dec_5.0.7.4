.class Lcom/join/mgps/activity/SearchHintActivity$r$a;
.super Ljava/lang/Object;
.source "SearchHintActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchHintActivity$r;->c(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/join/mgps/dto/SearchAutoDataBean;

.field final synthetic d:Lcom/join/mgps/activity/SearchHintActivity$r;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchHintActivity$r;Ljava/lang/String;Lcom/join/mgps/dto/SearchAutoDataBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$r$a;->d:Lcom/join/mgps/activity/SearchHintActivity$r;

    iput-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$r$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/join/mgps/activity/SearchHintActivity$r$a;->c:Lcom/join/mgps/dto/SearchAutoDataBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$r$a;->d:Lcom/join/mgps/activity/SearchHintActivity$r;

    iget-object p1, p1, Lcom/join/mgps/activity/SearchHintActivity$r;->e:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$r$a;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/SearchHintActivity;->r0(Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$r$a;->d:Lcom/join/mgps/activity/SearchHintActivity$r;

    invoke-static {p1}, Lcom/join/mgps/activity/SearchHintActivity$r;->a(Lcom/join/mgps/activity/SearchHintActivity$r;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$r$a;->c:Lcom/join/mgps/dto/SearchAutoDataBean;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$r$a;->d:Lcom/join/mgps/activity/SearchHintActivity$r;

    invoke-virtual {p1}, Lcom/join/mgps/activity/SearchHintActivity$r;->notifyDataSetChanged()V

    return-void
.end method
