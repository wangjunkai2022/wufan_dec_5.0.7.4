.class Lcom/join/mgps/activity/SearchListActivity1$j$a;
.super Ljava/lang/Object;
.source "SearchListActivity1.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchListActivity1$j;->c(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/SearchAutoDataBean;

.field final synthetic c:Lcom/join/mgps/activity/SearchListActivity1$j;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchListActivity1$j;Lcom/join/mgps/dto/SearchAutoDataBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$j$a;->c:Lcom/join/mgps/activity/SearchListActivity1$j;

    iput-object p2, p0, Lcom/join/mgps/activity/SearchListActivity1$j$a;->b:Lcom/join/mgps/dto/SearchAutoDataBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$j$a;->c:Lcom/join/mgps/activity/SearchListActivity1$j;

    invoke-static {p1}, Lcom/join/mgps/activity/SearchListActivity1$j;->a(Lcom/join/mgps/activity/SearchListActivity1$j;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1$j$a;->b:Lcom/join/mgps/dto/SearchAutoDataBean;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1$j$a;->c:Lcom/join/mgps/activity/SearchListActivity1$j;

    invoke-virtual {p1}, Lcom/join/mgps/activity/SearchListActivity1$j;->notifyDataSetChanged()V

    return-void
.end method
