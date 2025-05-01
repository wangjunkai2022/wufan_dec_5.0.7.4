.class public final synthetic Lcom/join/kotlin/ui/notice/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/join/kotlin/ui/notice/NoticeListActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/ui/notice/NoticeListActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/notice/a;->a:Lcom/join/kotlin/ui/notice/NoticeListActivity;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/join/kotlin/ui/notice/a;->a:Lcom/join/kotlin/ui/notice/NoticeListActivity;

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    invoke-static {v0, p1}, Lcom/join/kotlin/ui/notice/NoticeListActivity;->g0(Lcom/join/kotlin/ui/notice/NoticeListActivity;Lcom/join/mgps/dto/ResponseModel;)V

    return-void
.end method
