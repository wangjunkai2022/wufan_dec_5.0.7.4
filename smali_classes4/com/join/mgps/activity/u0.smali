.class public final synthetic Lcom/join/mgps/activity/u0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/HavenDownActivity$a;

.field public final synthetic c:Lcom/join/mgps/dto/HavenForumListbean;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/HavenDownActivity$a;Lcom/join/mgps/dto/HavenForumListbean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/u0;->b:Lcom/join/mgps/activity/HavenDownActivity$a;

    iput-object p2, p0, Lcom/join/mgps/activity/u0;->c:Lcom/join/mgps/dto/HavenForumListbean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/activity/u0;->b:Lcom/join/mgps/activity/HavenDownActivity$a;

    iget-object v1, p0, Lcom/join/mgps/activity/u0;->c:Lcom/join/mgps/dto/HavenForumListbean;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/activity/HavenDownActivity$a;->a(Lcom/join/mgps/activity/HavenDownActivity$a;Lcom/join/mgps/dto/HavenForumListbean;Landroid/view/View;)V

    return-void
.end method
